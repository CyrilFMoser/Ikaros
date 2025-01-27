@main def main() = {
  sealed trait T_A[A, B]
  case class CC_A() extends T_A
  case class CC_C(a: Char, b: T_A[Byte, Byte], c: Byte)
  case class CC_E[E](a: E, b: Boolean)
  val n: Null & AnyVal = null.asInstanceOf[Null & AnyVal]
  val v_a = CC_E(CC_C(n, n, n), true)
  val v_b = v_a match {
    case CC_E(CC_C(_, _, _), true) => 1
    case CC_E(_, _)                => 3
  }
  print(v_b)
}
