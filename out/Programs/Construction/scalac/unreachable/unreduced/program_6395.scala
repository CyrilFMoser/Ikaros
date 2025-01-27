package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[(T_A[Char],(Boolean,Char))]
case class CC_B(a: CC_A) extends T_A[(T_A[Char],(Boolean,Char))]
case class CC_C() extends T_A[(T_A[Char],(Boolean,Char))]

val v_a: T_A[(T_A[Char],(Boolean,Char))] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(CC_A(_))