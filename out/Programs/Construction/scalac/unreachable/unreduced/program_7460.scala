package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: (T_A[T_B],T_B)) extends T_A[T_B]
case class CC_B(a: Int, b: T_A[Byte], c: Int) extends T_A[T_B]
case class CC_C() extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
  case CC_A(_, (CC_B(_, _, _),_)) => 1 
  case CC_A(_, (CC_C(),_)) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(_, _, _)