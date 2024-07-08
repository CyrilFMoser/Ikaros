package Program_21 

 object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Int, Char], b: T_B[Boolean]) extends T_A[T_A[Byte, Boolean], T_A[Char, Char]]
case class CC_B() extends T_B[T_B[Byte]]
case class CC_C(a: (CC_A,CC_A)) extends T_B[T_B[Byte]]
case class CC_D[D]() extends T_B[D]

val v_a: T_A[T_A[Byte, Boolean], T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D()) => 0 
  case CC_A(_, _) => 1 
}
}