package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[(Byte,Int)]]]
case class CC_B() extends T_A[T_A[T_A[(Byte,Int)]]]
case class CC_C(a: CC_B, b: Boolean, c: (T_A[(Int,Boolean)],CC_A)) extends T_A[T_A[T_A[(Byte,Int)]]]

val v_a: T_A[T_A[T_A[(Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_B(), _, (_,CC_A(_)))