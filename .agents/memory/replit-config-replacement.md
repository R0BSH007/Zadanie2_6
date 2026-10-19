---
name: Replit config replacement
description: Preserve environment and run configuration when validating a replacement .replit file.
---

When validating and replacing `.replit`, include the complete existing configuration. Replacing the file without its Nix package and workflow sections can remove installed toolchains and configured workflows.

**Why:** The validated file replaces the current file rather than merging with it.

**How to apply:** Preserve all existing sections in the temporary file, then verify required executables and workflow status after replacement.
