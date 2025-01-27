package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Boolean)], b: Char) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: (T_A[CC_A],(Boolean,CC_A))) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C((_,(_,_))) => 2 
}
}