package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, (Byte,Int)], b: T_A[C, C]) extends T_A[C, (Byte,Int)]
case class CC_B[D](a: T_A[D, (Byte,Int)], b: Boolean) extends T_A[D, (Byte,Int)]
case class CC_C[E](a: ((Int,Byte),CC_B[Boolean])) extends T_A[E, (Byte,Int)]

val v_a: T_A[Int, (Byte,Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C((_,_)) => 2 
}
}