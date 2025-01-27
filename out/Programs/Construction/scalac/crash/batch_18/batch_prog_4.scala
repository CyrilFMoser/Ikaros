package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_A,Boolean), b: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), _) => 0 
  case CC_A((CC_B(),_), _) => 1 
  case CC_B() => 2 
}
}