package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Char) extends T_A[T_A[Int]]
case class CC_B(a: (Byte,T_A[(Byte,Char)]), b: T_A[T_A[Int]], c: CC_A) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}