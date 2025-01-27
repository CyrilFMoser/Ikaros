package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[Char, (Boolean,Byte)], Byte], C]
case class CC_B[D](a: T_A[D, D], b: Char, c: Char) extends T_A[T_A[T_A[Char, (Boolean,Byte)], Byte], D]

val v_a: T_A[T_A[T_A[Char, (Boolean,Byte)], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}