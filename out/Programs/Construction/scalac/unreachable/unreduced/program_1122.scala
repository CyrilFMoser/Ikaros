package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, (Char,Boolean)],T_A[Char, Byte]), b: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B[D](a: CC_A[D], b: CC_A[(Byte,(Int,Int))], c: CC_A[D]) extends T_A[D, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, _)) => 0 
  case CC_A((_,_), CC_B(_, _, _)) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 2 
}
}