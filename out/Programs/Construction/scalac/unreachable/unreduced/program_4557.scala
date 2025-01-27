package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D], b: T_A[E, E]) extends T_A[E, D]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C(a: CC_A[Int, Byte]) extends T_A[CC_A[(Int,Boolean), ((Int,Char),(Int,Char))], CC_A[CC_A[Char, Byte], CC_A[Int, Byte]]]
case class CC_D(a: Boolean, b: T_A[CC_A[CC_C, (Byte,Int)], T_A[CC_C, CC_C]], c: Boolean) extends T_B[CC_A[CC_B[CC_C, (Boolean,Boolean)], T_B[CC_C]]]
case class CC_E(a: Byte, b: T_A[CC_B[CC_D, Boolean], Int], c: (CC_A[CC_C, CC_D],T_A[CC_D, CC_D])) extends T_B[T_A[CC_C, T_A[CC_D, CC_C]]]

val v_a: T_A[CC_D, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B())) => 1 
  case CC_A(_, CC_B()) => 2 
  case CC_B() => 3 
}
}