package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, F], b: T_A[F, F], c: Char) extends T_A[F, E]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C(a: T_A[T_A[Boolean, Boolean], (Boolean,Int)]) extends T_B[(T_B[Boolean, Char],T_B[(Boolean,Char), Boolean]), Char]
case class CC_D(a: T_A[Boolean, ((Int,Byte),Boolean)], b: CC_C) extends T_B[(T_B[Boolean, Char],T_B[(Boolean,Char), Boolean]), Char]

val v_a: T_B[(T_B[Boolean, Char],T_B[(Boolean,Char), Boolean]), Char] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(_, _, _), CC_C(CC_A(_, _, _))) => 1 
  case CC_D(CC_B(), CC_C(CC_A(_, _, _))) => 2 
  case CC_D(CC_A(_, _, _), CC_C(CC_B())) => 3 
}
}
// This is not matched: CC_D(CC_B(), CC_C(CC_B()))