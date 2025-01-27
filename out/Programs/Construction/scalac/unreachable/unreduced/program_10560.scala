package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Byte], T_A[Int, (Byte,Boolean)]], C]
case class CC_B[D](a: T_A[D, D], b: (T_A[(Int,Byte), Int],Byte)) extends T_A[T_A[T_A[Byte, Byte], T_A[Int, (Byte,Boolean)]], D]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Int, (Byte,Boolean)]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_)) => 1 
}
}