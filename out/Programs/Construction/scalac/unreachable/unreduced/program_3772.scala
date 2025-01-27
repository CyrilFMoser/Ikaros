package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_A[Byte, Boolean]), b: T_B, c: T_B) extends T_A[C, T_A[Boolean, T_B]]
case class CC_B() extends T_A[T_B, T_A[Boolean, T_B]]
case class CC_C() extends T_B
case class CC_D(a: T_B, b: Int) extends T_B
case class CC_E(a: Byte, b: Byte) extends T_B

val v_a: T_A[T_B, T_A[Boolean, T_B]] = null
val v_b: Int = v_a match{
  case CC_A((CC_C(),_), _, CC_C()) => 0 
  case CC_A((CC_D(_, _),_), _, CC_C()) => 1 
  case CC_A((CC_E(_, _),_), _, CC_C()) => 2 
  case CC_A((CC_C(),_), _, CC_D(_, _)) => 3 
  case CC_A((CC_D(_, _),_), _, CC_D(_, _)) => 4 
  case CC_A((CC_E(_, _),_), _, CC_D(_, _)) => 5 
  case CC_A((CC_C(),_), _, CC_E(_, _)) => 6 
  case CC_A((CC_D(_, _),_), _, CC_E(_, _)) => 7 
  case CC_A((CC_E(_, _),_), _, CC_E(_, _)) => 8 
  case CC_B() => 9 
}
}