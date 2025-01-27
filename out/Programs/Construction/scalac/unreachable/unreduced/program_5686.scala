package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[(Char,Char), C], c: (T_A[Char, Byte],T_A[Char, Int])) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Char]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Char]], D]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Byte, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
}
}