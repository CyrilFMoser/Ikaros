package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Boolean],Int), b: (T_A[Int],T_A[Boolean])) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}