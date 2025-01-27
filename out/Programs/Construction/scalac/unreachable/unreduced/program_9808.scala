package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Byte], T_B[Char]]) extends T_A[T_A[((Char,Byte),Int), T_B[Boolean]], T_A[T_A[Boolean, Byte], (Char,Char)]]
case class CC_B(a: Boolean, b: Char) extends T_A[T_A[((Char,Byte),Int), T_B[Boolean]], T_A[T_A[Boolean, Byte], (Char,Char)]]
case class CC_C[D](a: Int, b: CC_B) extends T_B[D]
case class CC_D[E, F](a: CC_A) extends T_B[E]
case class CC_E() extends T_B[(CC_A,CC_A)]

val v_a: T_B[T_A[T_A[((Char,Byte),Int), T_B[Boolean]], T_A[T_A[Boolean, Byte], (Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_C(12, CC_B(_, _)) => 0 
  case CC_D(CC_A(_)) => 1 
}
}
// This is not matched: CC_C(_, CC_B(_, _))