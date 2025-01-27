package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[T_B[D], D], c: Byte) extends T_A[D, T_B[(Byte,Int)]]
case class CC_B[E](a: ((Boolean,Int),T_B[Char]), b: E) extends T_A[E, T_B[(Byte,Int)]]

val v_a: T_A[Boolean, T_B[(Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(((_,_),_), true) => 1 
  case CC_B(((_,_),_), false) => 2 
}
}