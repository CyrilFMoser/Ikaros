package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: Boolean) extends T_A[Char]
case class CC_B(a: T_A[(CC_A,(Boolean,Boolean))], b: (CC_A,T_A[CC_A])) extends T_A[Char]
case class CC_C(a: CC_A, b: CC_A, c: CC_A) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B(_, (CC_A(_, _),_)) => 2 
  case CC_C(_, _, _) => 3 
}
}