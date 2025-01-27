package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Char]], b: (T_B,T_A[(Byte,Char)])) extends T_A[T_A[Char]]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C(a: CC_B) extends T_B

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), (_,_)) => 0 
  case CC_A(CC_B(), (_,_)) => 1 
  case CC_B() => 2 
}
}