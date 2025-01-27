package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, (Byte,(Byte,Byte))]
case class CC_B[D](a: CC_A[D], b: CC_A[D]) extends T_A[D, (Byte,(Byte,Byte))]

val v_a: T_A[Char, (Byte,(Byte,Byte))] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}