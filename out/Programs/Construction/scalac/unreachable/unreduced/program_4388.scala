package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Char]]]
case class CC_B(a: (T_A[CC_A],CC_A)) extends T_A[T_B[T_A[Char]]]
case class CC_C(a: CC_B) extends T_A[T_B[T_A[Char]]]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
  case CC_C(CC_B((_,_))) => 2 
}
}