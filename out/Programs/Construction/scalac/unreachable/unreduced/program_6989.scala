package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Char], T_A[Int, Char]]) extends T_A[(Int,T_A[Boolean, Char]), (T_A[Boolean, (Boolean,Boolean)],(Boolean,Char))]
case class CC_B(a: CC_A) extends T_A[(Int,T_A[Boolean, Char]), (T_A[Boolean, (Boolean,Boolean)],(Boolean,Char))]
case class CC_C(a: CC_B, b: Char) extends T_A[(Int,T_A[Boolean, Char]), (T_A[Boolean, (Boolean,Boolean)],(Boolean,Char))]

val v_a: T_A[(Int,T_A[Boolean, Char]), (T_A[Boolean, (Boolean,Boolean)],(Boolean,Char))] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(CC_A(_)), _) => 2 
}
}