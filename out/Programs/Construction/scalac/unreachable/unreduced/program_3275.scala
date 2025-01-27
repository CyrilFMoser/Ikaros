package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[(Boolean,Boolean), Int], T_B[Byte, Int]], b: T_B[T_A[Int, Boolean], T_A[Boolean, Int]]) extends T_A[(T_A[Byte, Boolean],T_A[Int, (Boolean,Boolean)]), Char]
case class CC_B(a: (CC_A,T_B[Boolean, CC_A])) extends T_A[(T_A[Byte, Boolean],T_A[Int, (Boolean,Boolean)]), Char]
case class CC_C(a: T_B[CC_B, T_A[CC_B, CC_B]]) extends T_A[(T_A[Byte, Boolean],T_A[Int, (Boolean,Boolean)]), Char]
case class CC_D[E, F](a: F, b: Char) extends T_B[E, F]
case class CC_E[G, H]() extends T_B[G, H]

val v_a: CC_D[Char, T_A[(T_A[Byte, Boolean],T_A[Int, (Boolean,Boolean)]), Char]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
  case CC_D(CC_B((_,_)), _) => 1 
  case CC_D(CC_C(CC_D(_, _)), _) => 2 
  case CC_D(CC_C(CC_E()), _) => 3 
}
}