package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_B[CC_A[Byte], T_A[(Byte,Boolean)]], b: T_A[CC_A[Byte]], c: CC_A[T_A[Byte]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C() extends T_A[T_B[T_B[CC_B, CC_B], Boolean]]
case class CC_D[E](a: T_B[E, CC_A[E]], b: T_A[E]) extends T_B[E, CC_A[E]]
case class CC_E(a: CC_A[T_B[CC_C, CC_C]], b: (T_B[(Char,Byte), CC_C],Boolean)) extends T_B[T_A[Boolean], CC_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}