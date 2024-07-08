object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(               ) extends T_A
case class CC_B(a: CC_A, b:         CC_A  ) extends T_B
case class CC_C(a: (CC_A,T_A[Boolean]), b: Int, c: Char) extends T_B
val v_a: T_B = null
val v_b      = v_a match{
  case CC_B(_, _) => 0
  case CC_C((_,_), _, _) => 1
}
}
