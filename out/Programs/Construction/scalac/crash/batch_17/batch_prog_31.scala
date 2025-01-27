package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B[C, D](a: CC_A, b: T_A[C]) extends T_A[C]
case class CC_C(a: T_B[T_A[Boolean]], b: T_B[T_B[(Char,Boolean)]], c: T_A[T_A[Byte]]) extends T_B[T_A[Boolean]]
case class CC_D(a: (T_A[Int],CC_C), b: Boolean, c: Int) extends T_B[T_A[Boolean]]
case class CC_E(a: Int) extends T_B[T_A[Boolean]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_B(CC_A(), CC_A())) => 1 
  case CC_B(CC_A(), CC_B(CC_A(), CC_B(_, _))) => 2 
}
}
// This is not matched: CC_B(CC_A(), CC_A())