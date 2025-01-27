package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: (T_A,T_B[Char]), c: Byte) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_B[T_B[CC_B]], c: CC_B) extends T_B[T_B[CC_B]]
case class CC_D(a: CC_C, b: (Boolean,T_A), c: Char) extends T_B[T_B[CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (CC_A(_, _, _),_), _) => 0 
  case CC_A(CC_B(), (CC_A(_, _, _),_), _) => 1 
  case CC_A(CC_A(_, _, _), (CC_B(),_), _) => 2 
  case CC_A(CC_B(), (CC_B(),_), _) => 3 
  case CC_B() => 4 
}
}