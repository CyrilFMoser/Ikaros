package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[Boolean, C]
case class CC_B(a: T_A[T_A[Boolean, T_B], T_A[Boolean, T_B]], b: Boolean) extends T_B
case class CC_C() extends T_B
case class CC_D(a: (T_A[Boolean, T_B],CC_A[CC_C])) extends T_B

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _)) => 0 
  case CC_A(CC_C()) => 1 
  case CC_A(CC_D((_,_))) => 2 
}
}