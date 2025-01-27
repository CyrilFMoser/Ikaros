package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: (Char,Boolean)) extends T_A[T_A[T_A[(Boolean,Byte), Boolean], T_B[Boolean]], D]
case class CC_B[E](a: Char) extends T_A[T_A[T_A[(Boolean,Byte), Boolean], T_B[Boolean]], E]
case class CC_C[F](a: CC_B[T_A[F, F]]) extends T_A[T_A[T_A[(Boolean,Byte), Boolean], T_B[Boolean]], F]
case class CC_D[G](a: G, b: CC_C[G]) extends T_B[G]

val v_a: T_A[T_A[T_A[(Boolean,Byte), Boolean], T_B[Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,true)) => 0 
  case CC_A(_, (_,false)) => 1 
  case CC_C(CC_B(_)) => 2 
}
}
// This is not matched: CC_B(_)