package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],T_A[Byte]), b: T_A[T_A[Byte]], c: (Char,T_A[Char])) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: ((CC_B,CC_A),(CC_B,CC_A)), b: CC_B, c: CC_A) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)