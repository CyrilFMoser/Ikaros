package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, (T_A[Boolean, (Boolean,Byte)],T_A[Byte, Int])]
case class CC_B[D, E](a: T_A[E, E]) extends T_A[D, (T_A[Boolean, (Boolean,Byte)],T_A[Byte, Int])]
case class CC_C[F](a: Char) extends T_A[F, (T_A[Boolean, (Boolean,Byte)],T_A[Byte, Int])]

val v_a: T_A[Boolean, (T_A[Boolean, (Boolean,Byte)],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}