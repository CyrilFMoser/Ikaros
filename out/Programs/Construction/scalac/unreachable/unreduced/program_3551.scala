package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Byte]), b: Int) extends T_A[Char]
case class CC_B(a: T_A[(Int,(Boolean,Boolean))]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}