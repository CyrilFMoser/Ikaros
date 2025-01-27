package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A[Int]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: (Boolean,Byte), b: T_A[CC_A[CC_B]]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C((_,_), _) => 2 
}
}