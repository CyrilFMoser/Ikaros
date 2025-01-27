package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[C, Byte]
case class CC_B[D](a: (T_A[Byte, Byte],T_A[Boolean, Boolean]), b: D) extends T_A[D, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B((CC_A(_, _),_), _) => 2 
  case CC_B((CC_B(_, _),_), _) => 3 
}
}