object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Boolean, T_A[Int, T_A[Boolean, Char]]]
case class CC_B(a:         CC_A              , b: Byte, c: T_A[Char, Int]) extends T_A[Boolean, T_A[Int, T_A[Boolean, Char]]]
val v_a: T_A[Boolean, T_A[Int, T_A[Boolean, Char]]] = null
val v_b      = v_a match{
  case CC_A() => 0
  case CC_B(_, _, _) => 1
}
}
