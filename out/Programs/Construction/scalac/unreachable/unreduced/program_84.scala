package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[T_B[Byte]], T_B[T_A[Boolean, Boolean]]]
case class CC_B(a: T_B[CC_A], b: T_A[T_B[CC_A], T_A[CC_A, CC_A]]) extends T_A[T_B[T_B[Byte]], T_B[T_A[Boolean, Boolean]]]
case class CC_C(a: CC_A, b: (Boolean,CC_A)) extends T_A[T_B[T_B[Byte]], T_B[T_A[Boolean, Boolean]]]
case class CC_D(a: (CC_A,CC_B), b: T_B[Char], c: CC_B) extends T_B[CC_B]

val v_a: T_A[T_B[T_B[Byte]], T_B[T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, (_,_)) => 1 
}
}
// This is not matched: CC_A()