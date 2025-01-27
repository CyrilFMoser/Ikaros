package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[T_A[(Boolean,Byte), (Boolean,Byte)], T_A[(Boolean,Byte), (Boolean,Byte)]], T_A[(Boolean,Byte), (Boolean,Byte)]]) extends T_A[T_A[D, D], D]
case class CC_C[F](a: CC_B[Char], b: F) extends T_A[T_A[F, F], F]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_)), _) => 0 
  case CC_C(CC_B(CC_B(_)), _) => 1 
  case CC_C(CC_B(CC_C(_, _)), _) => 2 
}
}