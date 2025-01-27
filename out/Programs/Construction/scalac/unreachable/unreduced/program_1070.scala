package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: (T_A[Byte],T_A[Char]), c: Boolean) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A, b: (Boolean,T_A[CC_B])) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
  case CC_C(_, (_,_)) => 2 
}
}