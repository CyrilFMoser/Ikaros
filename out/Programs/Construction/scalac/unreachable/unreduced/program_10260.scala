package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[(Int,Char), Byte],Byte), b: (T_A[Int, (Int,Int)],T_A[Byte, Int])) extends T_A[T_A[T_A[Boolean, Int], T_A[Byte, Int]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Boolean, Int], T_A[Byte, Int]], D]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Byte, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
}
}