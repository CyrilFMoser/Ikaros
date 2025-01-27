package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Int, Byte],T_A[Int, Char])) extends T_A[T_A[C, C], C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
}
}