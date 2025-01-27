package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: T_A[E, (Byte,Int)], b: (T_B[Byte, Byte],Int)) extends T_A[F, E]
case class CC_B[I, H](a: T_A[I, I]) extends T_A[I, H]
case class CC_C(a: T_A[T_A[Byte, Byte], (Byte,Byte)], b: T_A[Int, (Int,Byte)], c: T_A[T_A[Byte, (Byte,Byte)], T_A[Char, Boolean]]) extends T_B[Boolean, T_A[Boolean, T_A[(Int,Boolean), Char]]]
case class CC_D() extends T_B[Boolean, T_A[Boolean, T_A[(Int,Boolean), Char]]]

val v_a: T_A[Int, CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, (_,_))) => 1 
}
}
// This is not matched: CC_B(CC_B(_))