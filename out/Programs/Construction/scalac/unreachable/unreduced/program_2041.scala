package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (T_A[Int, Char],(Boolean,Char))]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, (T_A[Int, Char],(Boolean,Char))]

val v_a: T_A[Boolean, (T_A[Int, Char],(Boolean,Char))] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}