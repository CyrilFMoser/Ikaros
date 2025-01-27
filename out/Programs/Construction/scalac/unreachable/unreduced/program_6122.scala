package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: (T_A,T_B[Char])) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: CC_A) extends T_A
case class CC_D(a: T_A, b: CC_C) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
  case CC_A(_, (CC_B(),_)) => 1 
  case CC_A(_, (CC_C(_, _),_)) => 2 
  case CC_B() => 3 
  case CC_C(CC_B(), CC_A(_, (_,_))) => 4 
}
}