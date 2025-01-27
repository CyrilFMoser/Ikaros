package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Byte]], c: (T_A[Byte],T_A[Boolean])) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: (T_A[CC_B],CC_B), b: (CC_A,CC_A), c: Boolean) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
  case CC_C((_,CC_B()), _, _) => 2 
}
}