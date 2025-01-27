package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Byte,Char), b: Byte) extends T_A[E, Char]
case class CC_B[G, F](a: ((Char,Byte),T_A[Byte, Char]), b: (Boolean,Byte)) extends T_A[G, F]

val v_a: CC_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, (true,0)) => 0 
  case CC_B(_, (true,_)) => 1 
  case CC_B(_, (false,0)) => 2 
  case CC_B(_, (false,_)) => 3 
}
}