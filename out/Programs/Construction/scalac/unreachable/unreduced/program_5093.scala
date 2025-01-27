package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: (T_A,T_B[Int, CC_A])) extends T_A
case class CC_C[C](a: T_B[C, C], b: CC_A) extends T_B[C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (CC_A(),_)) => 1 
  case CC_B(CC_A(), (CC_B(_, _),_)) => 2 
  case CC_B(CC_B(_, (_,_)), (CC_A(),_)) => 3 
  case CC_B(CC_B(_, (_,_)), (CC_B(_, _),_)) => 4 
}
}