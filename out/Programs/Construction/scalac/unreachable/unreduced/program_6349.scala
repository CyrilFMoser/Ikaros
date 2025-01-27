package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: T_A[C, D]) extends T_A[T_A[T_A[(Boolean,Int), Int], T_A[(Byte,Byte), Int]], C]
case class CC_B[E](a: T_A[E, E], b: CC_A[E, E]) extends T_A[T_A[T_A[(Boolean,Int), Int], T_A[(Byte,Byte), Int]], E]
case class CC_C[F](a: Boolean) extends T_A[T_A[T_A[(Boolean,Int), Int], T_A[(Byte,Byte), Int]], F]

val v_a: T_A[T_A[T_A[(Boolean,Int), Int], T_A[(Byte,Byte), Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(true) => 1 
  case CC_C(false) => 2 
}
}
// This is not matched: CC_B(_, CC_A(_, _))