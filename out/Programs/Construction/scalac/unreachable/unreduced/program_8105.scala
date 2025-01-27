package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Byte, Boolean],T_A[Boolean, Int])) extends T_A[T_A[T_A[C, Byte], C], C]
case class CC_B[D](a: CC_A[D], b: ((Char,(Int,Int)),CC_A[Int])) extends T_A[T_A[T_A[D, Byte], D], D]

val v_a: T_A[T_A[T_A[Byte, Byte], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _) => 1 
}
}