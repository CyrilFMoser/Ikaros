package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,(Int,Char))) extends T_A[T_A[Int, T_A[Byte, Boolean]], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: CC_A[D]) extends T_A[T_A[Int, T_A[Byte, Boolean]], D]

val v_a: T_A[T_A[Int, T_A[Byte, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_, _, _) => 1 
}
}