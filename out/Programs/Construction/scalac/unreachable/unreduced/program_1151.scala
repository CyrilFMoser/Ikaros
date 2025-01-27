package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Boolean,Byte), T_A[(Boolean,Byte)]], b: T_B[T_B[Byte, Char], T_B[Char, Boolean]], c: T_A[T_B[Boolean, Char]]) extends T_A[T_B[T_A[Boolean], Int]]
case class CC_B[D, E]() extends T_B[E, D]
case class CC_C[F](a: F, b: T_A[F], c: Int) extends T_B[CC_B[Char, T_B[CC_A, CC_A]], F]
case class CC_D(a: (T_B[CC_A, CC_A],T_B[CC_A, Int])) extends T_B[CC_B[Char, T_B[CC_A, CC_A]], CC_B[Boolean, CC_A]]

val v_a: T_B[CC_B[Char, T_B[CC_A, CC_A]], CC_B[Boolean, CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _, _) => 0 
  case CC_D((_,_)) => 1 
}
}
// This is not matched: CC_B()