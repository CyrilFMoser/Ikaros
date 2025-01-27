package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, Byte]
case class CC_B[D](a: (T_A[Int, (Int,Byte)],Byte)) extends T_A[D, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_)) => 1 
}
}