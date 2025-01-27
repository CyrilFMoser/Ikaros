package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Boolean, (Int,Boolean)], T_A[(Int,Char), Boolean]], Boolean]
case class CC_B(a: T_A[T_A[CC_A, CC_A], (CC_A,CC_A)], b: CC_A) extends T_A[T_A[T_A[Boolean, (Int,Boolean)], T_A[(Int,Char), Boolean]], Boolean]

val v_a: T_A[T_A[T_A[Boolean, (Int,Boolean)], T_A[(Int,Char), Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}